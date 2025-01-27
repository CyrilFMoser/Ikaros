package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: C) extends T_A[C]
case class CC_B[D](a: (T_B[Int],CC_A[Int])) extends T_A[D]
case class CC_C[E]() extends T_A[E]
case class CC_D(a: T_A[T_A[Byte]]) extends T_B[T_A[(Char,Int)]]

val v_a: T_B[T_A[(Char,Int)]] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, CC_A(_, _))) => 0 
  case CC_D(CC_A(_, CC_B(_))) => 1 
  case CC_D(CC_A(_, CC_C())) => 2 
  case CC_D(CC_B((_,_))) => 3 
  case CC_D(CC_C()) => 4 
}
}