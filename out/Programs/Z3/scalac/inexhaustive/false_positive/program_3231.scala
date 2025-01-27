package Program_15 

package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: Int) extends T_A
case class CC_B(a: T_A, b: T_A, c: T_B[CC_A, CC_A]) extends T_A
case class CC_C[D, C](a: Char, b: CC_B, c: CC_B) extends T_B[C, D]
case class CC_D[F, E, G](a: (T_A,Char), b: T_B[F, G]) extends T_B[E, F]

val v_a: T_B[CC_A, T_A] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_D((CC_A(_, _),_), _) => 1 
  case CC_D((CC_A(_, _),'x'), CC_D(_, _)) => 2 
  case CC_D((CC_B(_, _, _),_), CC_D(_, _)) => 3 
  case CC_C(_, CC_B(_, _, _), _) => 4 
  case CC_C('x', _, _) => 5 
}
}
// This is not matched: (CC_D T_A
//      (CC_A (CC_A T_A T_A T_A) (CC_A T_A T_A T_A) (CC_A T_A T_A T_A))
//      (CC_A T_A T_A T_A)
//      Wildcard
//      Wildcard
//      (T_B (CC_A (CC_A T_A T_A T_A) (CC_A T_A T_A T_A) (CC_A T_A T_A T_A)) T_A))
// This is not matched: (CC_B Wildcard Wildcard Wildcard T_A)