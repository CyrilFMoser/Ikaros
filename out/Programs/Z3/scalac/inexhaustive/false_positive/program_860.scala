package Program_31 

package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_A,T_A), b: T_B[Int, Byte]) extends T_A
case class CC_B[C](a: T_B[C, C]) extends T_A
case class CC_C[D]() extends T_B[CC_A, D]
case class CC_D[F, E](a: Boolean, b: Boolean) extends T_B[E, F]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(_, _)) => 0 
  case CC_A((CC_B(_),CC_A(_, _)), _) => 1 
  case CC_B(CC_C()) => 2 
  case CC_B(_) => 3 
}
}
// This is not matched: (CC_B T_A Wildcard T_A)
// This is not matched: (CC_B T_A Wildcard T_A)