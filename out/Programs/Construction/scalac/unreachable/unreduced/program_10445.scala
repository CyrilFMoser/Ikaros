package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_A[(Char,Byte), T_B],T_A[T_B, Byte]), b: T_B) extends T_A[C, Byte]
case class CC_B[D](a: (CC_A[T_B],T_A[T_B, Byte])) extends T_A[D, Byte]
case class CC_C(a: CC_A[T_A[T_B, Byte]]) extends T_B

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A((_,CC_A(_, _)), _) => 0 
  case CC_A((_,CC_B(_)), _) => 1 
  case CC_B((CC_A(_, _),CC_A(_, _))) => 2 
  case CC_B((CC_A(_, _),CC_B(_))) => 3 
}
}