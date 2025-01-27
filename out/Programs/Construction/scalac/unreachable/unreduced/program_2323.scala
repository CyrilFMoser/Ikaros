package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_A,T_A), b: T_B[T_B[T_A, (Boolean,Char)], Byte]) extends T_A
case class CC_B(a: Char, b: (T_A,CC_A), c: T_A) extends T_A
case class CC_C[C](a: CC_A, b: CC_A) extends T_B[C, CC_A]
case class CC_D[D](a: T_A) extends T_B[D, CC_A]

val v_a: T_B[CC_A, CC_A] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(CC_A((_,_), _)) => 1 
  case CC_D(CC_B('x', _, CC_A(_, _))) => 2 
  case CC_D(CC_B('x', _, CC_B(_, _, _))) => 3 
  case CC_D(CC_B(_, _, CC_B(_, _, _))) => 4 
}
}
// This is not matched: CC_D(CC_B(_, _, CC_A(_, _)))