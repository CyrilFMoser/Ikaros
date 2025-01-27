package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (Char,T_A[Byte, Char]), b: T_A[T_A[Int, Int], T_A[(Byte,Char), Int]]) extends T_A[T_A[T_A[Int, Boolean], (Int,Boolean)], Int]
case class CC_B() extends T_A[T_A[T_A[Int, Boolean], (Int,Boolean)], Int]
case class CC_C[C]() extends T_A[C, T_A[C, C]]

val v_a: T_A[T_A[T_A[Int, Boolean], (Int,Boolean)], Int] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B() => 1 
}
}