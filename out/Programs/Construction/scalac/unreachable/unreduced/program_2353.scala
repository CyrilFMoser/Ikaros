package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: Int) extends T_A[T_A[T_A[Int, Boolean], T_A[Int, Byte]], C]
case class CC_B() extends T_A[T_A[T_A[Int, Boolean], T_A[Int, Byte]], Char]

val v_a: T_A[T_A[T_A[Int, Boolean], T_A[Int, Byte]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}