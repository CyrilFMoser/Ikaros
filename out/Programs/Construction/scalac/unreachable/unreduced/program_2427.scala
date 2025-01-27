package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_A[T_A[T_B, T_B], T_A[Int, T_B]], T_B]
case class CC_B(a: CC_A, b: CC_A, c: T_A[T_A[Char, Boolean], T_B]) extends T_A[T_A[T_A[T_B, T_B], T_A[Int, T_B]], T_B]
case class CC_C(a: CC_A, b: ((CC_B,(Char,Byte)),CC_A)) extends T_A[T_A[T_A[T_B, T_B], T_A[Int, T_B]], T_B]
case class CC_D(a: Byte, b: T_B) extends T_B
case class CC_E() extends T_B
case class CC_F(a: CC_A, b: (T_A[CC_B, CC_D],CC_B), c: CC_E) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(0, CC_D(_, CC_D(_, _))) => 0 
  case CC_D(_, CC_D(_, CC_D(_, _))) => 1 
  case CC_D(0, CC_D(_, CC_E())) => 2 
  case CC_D(_, CC_D(_, CC_E())) => 3 
  case CC_D(0, CC_D(_, CC_F(_, _, _))) => 4 
  case CC_D(_, CC_D(_, CC_F(_, _, _))) => 5 
  case CC_D(0, CC_E()) => 6 
  case CC_D(_, CC_E()) => 7 
  case CC_D(0, CC_F(_, (_,_), _)) => 8 
  case CC_D(_, CC_F(_, (_,_), _)) => 9 
  case CC_E() => 10 
  case CC_F(_, _, _) => 11 
}
}