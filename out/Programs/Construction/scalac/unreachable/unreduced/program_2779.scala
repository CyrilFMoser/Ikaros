package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[(Byte,Char), Char], T_A[Char, Byte]]) extends T_A[T_A[T_A[Int, Byte], T_A[Boolean, Byte]], T_A[T_A[Char, Int], T_A[(Int,Int), Byte]]]
case class CC_B(a: Int) extends T_A[T_A[T_A[Int, Byte], T_A[Boolean, Byte]], T_A[T_A[Char, Int], T_A[(Int,Int), Byte]]]
case class CC_C(a: T_A[T_A[Boolean, CC_A], CC_A]) extends T_A[T_A[T_A[Int, Byte], T_A[Boolean, Byte]], T_A[T_A[Char, Int], T_A[(Int,Int), Byte]]]

val v_a: T_A[T_A[T_A[Int, Byte], T_A[Boolean, Byte]], T_A[T_A[Char, Int], T_A[(Int,Int), Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}