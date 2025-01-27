package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, Char], Int]) extends T_A[T_A[T_A[Boolean, Char], T_A[Int, Int]], T_A[T_A[(Boolean,Int), Byte], T_A[(Char,Int), Boolean]]]
case class CC_B() extends T_A[T_A[T_A[Boolean, Char], T_A[Int, Int]], T_A[T_A[(Boolean,Int), Byte], T_A[(Char,Int), Boolean]]]
case class CC_C(a: T_A[CC_B, Char]) extends T_A[T_A[T_A[Boolean, Char], T_A[Int, Int]], T_A[T_A[(Boolean,Int), Byte], T_A[(Char,Int), Boolean]]]

val v_a: T_A[T_A[T_A[Boolean, Char], T_A[Int, Int]], T_A[T_A[(Boolean,Int), Byte], T_A[(Char,Int), Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}