package Program_31 

package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: Byte) extends T_A
case class CC_C(a: CC_A) extends T_A
case class CC_D[D, C, E](a: E) extends T_B[D, C]
case class CC_E[F, G](a: G) extends T_B[G, F]
case class CC_F(a: CC_B) extends T_B[T_A, (T_B[T_A, T_A],T_A)]

val v_a: CC_D[Byte, T_A, T_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_)) => 0 
  case CC_D(CC_C(_)) => 1 
}
}
// This is not matched: CC_D(CC_A(_))
// This is not matched: CC_B(CC_A())