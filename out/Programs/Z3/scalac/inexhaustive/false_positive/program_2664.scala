package Program_31 

package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C, E](a: D, b: T_B) extends T_A[D, C]
case class CC_B[F](a: T_A[F, F]) extends T_A[T_A[T_B, T_B], F]
case class CC_C(a: T_A[Boolean, (Boolean,Char)], b: T_B, c: T_B) extends T_A[T_A[T_B, T_B], T_A[Boolean, T_B]]
case class CC_D() extends T_B
case class CC_E(a: CC_B[Char]) extends T_B
case class CC_F(a: CC_B[CC_C]) extends T_B

val v_a: CC_B[CC_D] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_B (CC_D (T_A T_B T_B))
//      (CC_A (CC_D (T_A T_B T_B))
//            (CC_D (T_A T_B T_B))
//            T_B
//            (CC_D T_B)
//            (CC_D T_B)
//            (T_A (CC_D (T_A T_B T_B)) (CC_D (T_A T_B T_B))))
//      (T_A (T_A T_B T_B) (CC_D (T_A T_B T_B))))
// This is not matched: Pattern match is empty without constants