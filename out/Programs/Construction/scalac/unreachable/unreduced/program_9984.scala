package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: (T_B[Int, (Byte,Char)],T_A[Int, Byte])) extends T_A[T_B[T_B[Byte, Int], T_B[(Boolean,Boolean), Boolean]], E]
case class CC_B[F]() extends T_A[T_B[T_B[Byte, Int], T_B[(Boolean,Boolean), Boolean]], F]

val v_a: T_A[T_B[T_B[Byte, Int], T_B[(Boolean,Boolean), Boolean]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B() => 1 
}
}