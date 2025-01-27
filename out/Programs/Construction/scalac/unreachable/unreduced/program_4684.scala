package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Char, Boolean],T_A[Char, Int])) extends T_A[T_A[T_A[(Boolean,Byte), Boolean], Int], C]
case class CC_B[D]() extends T_A[T_A[T_A[(Boolean,Byte), Boolean], Int], D]

val v_a: T_A[T_A[T_A[(Boolean,Byte), Boolean], Int], Boolean] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B() => 1 
}
}