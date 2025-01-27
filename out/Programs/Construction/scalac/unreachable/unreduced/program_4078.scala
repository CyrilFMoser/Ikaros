package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[C, Byte], C], C]
case class CC_B[D]() extends T_A[T_A[T_A[D, Byte], D], D]
case class CC_C[E](a: CC_B[E], b: (T_A[Int, Char],T_A[Int, Int])) extends T_A[T_A[T_A[E, Byte], E], E]

val v_a: T_A[T_A[T_A[Boolean, Byte], Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(CC_B(), (_,_)) => 2 
}
}