package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (T_A[Char, Int],(Byte,Int))) extends T_A[T_A[T_A[Int, Int], Int], C]
case class CC_B[D]() extends T_A[T_A[T_A[Int, Int], Int], D]

val v_a: T_A[T_A[T_A[Int, Int], Int], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B() => 1 
}
}