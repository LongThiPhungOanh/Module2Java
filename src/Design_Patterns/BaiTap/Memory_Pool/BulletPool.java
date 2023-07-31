package Design_Patterns.BaiTap.Memory_Pool;

public class BulletPool extends  MemoryPool<Bullet>{
    @Override
    protected Bullet allocate() {
        return new Bullet();
    }
}
