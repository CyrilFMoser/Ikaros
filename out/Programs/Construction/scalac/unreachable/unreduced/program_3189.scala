package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[Int, T_A[T_B, T_B]]) extends T_A[T_A[T_B, T_A[T_B, T_B]], T_B]
case class CC_B[C](a: (T_B,Char), b: C, c: (CC_A,T_B)) extends T_A[T_A[T_B, T_A[T_B, T_B]], T_B]
case class CC_C(a: Int, b: T_B) extends T_A[T_A[T_B, T_A[T_B, T_B]], T_B]

val v_a: T_A[T_A[T_B, T_A[T_B, T_B]], T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B((_,_), _, _) => 1 
  case CC_C(_, _) => 2 
}
}