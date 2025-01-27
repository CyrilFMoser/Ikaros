package Program_15 

package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: Int) extends T_A
case class CC_B[D, C, E](a: T_B[D, D], b: CC_A, c: T_A) extends T_B[D, C]
case class CC_C[F](a: Int) extends T_B[F, T_B[F, F]]

val v_a: T_B[Boolean, T_B[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_B(_, CC_A(_, _), CC_A(_, _)) => 1 
}
}
// This is not matched: (CC_B Boolean
//      (T_B Boolean Boolean)
//      T_A
//      Wildcard
//      Wildcard
//      (CC_A Wildcard Wildcard T_A)
//      (T_B Boolean (T_B Boolean Boolean)))
// This is not matched: (CC_C Boolean Wildcard Wildcard (T_B (T_B Boolean)))