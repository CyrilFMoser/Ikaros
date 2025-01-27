package Program_28 

package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[(Byte,Char)], b: T_A, c: ((Boolean,Boolean),T_A)) extends T_A
case class CC_B(a: T_B[Char], b: Byte) extends T_A
case class CC_C(a: T_B[T_A]) extends T_A
case class CC_D[B](a: T_B[B], b: T_B[B]) extends T_B[B]
case class CC_E[C, D](a: T_B[D], b: Char, c: (Char,T_A)) extends T_B[C]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_D(_, _), 0) => 0 
  case CC_B(CC_E(_, _, _), _) => 1 
  case CC_B(CC_D(_, _), _) => 2 
  case CC_B(CC_E(_, _, _), 0) => 3 
}
}
// This is not matched: (CC_B (CC_E Char
//            T_A
//            (CC_E T_A T_A Wildcard Char Wildcard (T_B T_A))
//            Char
//            Wildcard
//            (T_B Char))
//      Wildcard
//      T_A)
// This is not matched: (CC_B T_A Wildcard T_A)