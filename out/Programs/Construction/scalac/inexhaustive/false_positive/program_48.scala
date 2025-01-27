package Program_62 

package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_B[Boolean, T_A], T_B[T_A, T_A]]) extends T_A
case class CC_B(a: (T_A,CC_A), b: T_A) extends T_A
case class CC_C[C](a: CC_B, b: C) extends T_B[Int, T_A]
case class CC_D(a: CC_C[T_B[Int, T_A]], b: T_B[T_B[Int, T_A], T_B[CC_A, CC_B]]) extends T_B[Int, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B((_,_), CC_B(_, _)), _) => 1 
  case CC_B((CC_A(_, _),CC_A(_, _)), _) => 2 
  case CC_B((CC_B(_, _),CC_A(_, _)), _) => 3 
}
}
// This is not matched: CC_A(CC_B((_,_), CC_A(_, _)), _)
// This is not matched: CC_B()