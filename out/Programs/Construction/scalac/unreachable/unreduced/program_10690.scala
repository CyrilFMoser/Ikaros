package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: (T_B,T_B), b: T_B) extends T_A[T_B, T_A[T_A[T_B, T_B], T_B]]
case class CC_B(a: CC_A, b: T_B, c: T_B) extends T_A[T_B, T_A[T_A[T_B, T_B], T_B]]
case class CC_C(a: CC_B, b: T_A[T_B, T_A[T_B, T_B]], c: CC_B) extends T_B
case class CC_D(a: Char, b: Int, c: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_B(CC_A(_, _), _, _), _, CC_B(_, _, _)) => 0 
  case CC_D(_, 12, CC_A((_,_), CC_C(_, _, _))) => 1 
  case CC_D(_, 12, CC_A((_,_), CC_D(_, _, _))) => 2 
  case CC_D(_, _, CC_A((_,_), CC_C(_, _, _))) => 3 
  case CC_D(_, _, CC_A((_,_), CC_D(_, _, _))) => 4 
}
}