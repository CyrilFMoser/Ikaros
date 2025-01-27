package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Int, (Byte,Int)], (Char,Boolean)], Byte]
case class CC_B(a: CC_A, b: CC_A) extends T_A[T_A[T_A[Int, (Byte,Int)], (Char,Boolean)], Byte]
case class CC_C(a: T_A[CC_A, CC_B]) extends T_A[T_A[T_A[Int, (Byte,Int)], (Char,Boolean)], Byte]

val v_a: T_A[T_A[T_A[Int, (Byte,Int)], (Char,Boolean)], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), CC_A()) => 1 
  case CC_C(_) => 2 
}
}