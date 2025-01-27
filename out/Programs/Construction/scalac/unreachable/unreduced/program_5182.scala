package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: C, b: T_B, c: C) extends T_A[C, T_B]
case class CC_B(a: CC_A[T_B, T_A[T_B, Int]], b: T_A[Int, Int], c: (T_A[T_B, T_B],T_A[(Int,Byte), Boolean])) extends T_A[T_A[T_A[Boolean, T_B], T_B], T_B]

val v_a: T_A[T_A[T_A[Boolean, T_B], T_B], T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_B(_, _, (CC_A(_, _, _),_)) => 1 
}
}