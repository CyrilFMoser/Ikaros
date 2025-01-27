package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[Boolean, T_A[T_B, T_B]], b: (T_A[Char, T_B],(T_B,T_B))) extends T_A[T_A[T_A[T_B, T_B], T_B], Boolean]
case class CC_B(a: T_B, b: Char, c: Int) extends T_A[T_A[T_A[T_B, T_B], T_B], Boolean]

val v_a: T_A[T_A[T_A[T_B, T_B], T_B], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B(_, _, _) => 1 
}
}