package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_C(a: T_B[T_A], b: T_B[Char]) extends T_B[T_A]
case class CC_D() extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_C(CC_C(_, _), _) => 1 
}
}
// This is not matched: (CC_B (CC_A Boolean Boolean Boolean)
//      (T_B (CC_A Boolean Boolean Boolean) (CC_A Boolean Boolean Boolean))
//      (T_A (CC_A Boolean Boolean Boolean)
//           (T_B (CC_A Boolean Boolean Boolean) (CC_A Boolean Boolean Boolean))))