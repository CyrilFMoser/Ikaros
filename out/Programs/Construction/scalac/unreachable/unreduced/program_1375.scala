package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[T_A[Boolean, Byte], (Char,Int)], E]
case class CC_B[F](a: (CC_A[(Int,Char)],(Boolean,Byte)), b: (T_A[Int, Boolean],T_A[Byte, Int]), c: F) extends T_A[T_B[T_A[Boolean, Byte], (Char,Int)], F]

val v_a: T_A[T_B[T_A[Boolean, Byte], (Char,Int)], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,_), (_,_), _) => 1 
}
}