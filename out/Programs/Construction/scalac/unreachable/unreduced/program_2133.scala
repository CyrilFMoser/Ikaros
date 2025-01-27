package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, (Byte,Int)], (Char,Int)], b: Byte) extends T_A[T_A[T_A[Boolean, Char], T_A[Int, Byte]], Int]
case class CC_B() extends T_A[T_A[T_A[Boolean, Char], T_A[Int, Byte]], Int]

val v_a: T_A[T_A[T_A[Boolean, Char], T_A[Int, Byte]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}