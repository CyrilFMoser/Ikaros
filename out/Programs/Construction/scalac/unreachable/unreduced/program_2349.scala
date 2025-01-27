package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C) extends T_A[C, T_B]
case class CC_B(a: T_A[CC_A[Int], T_B], b: T_A[CC_A[T_B], T_B], c: (T_B,T_A[(Char,Byte), T_B])) extends T_A[(T_A[T_B, T_B],CC_A[T_B]), T_B]
case class CC_C(a: T_A[T_B, T_A[CC_B, T_B]], b: (T_A[CC_B, T_B],T_A[T_B, T_B])) extends T_A[(T_A[T_B, T_B],CC_A[T_B]), T_B]

val v_a: T_A[(T_A[T_B, T_B],CC_A[T_B]), T_B] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_),CC_A(_))) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _) => 2 
}
}