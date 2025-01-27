package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[(Int,Char), Int], T_A[Boolean, Char]], T_A[(Int,Byte), T_A[Boolean, (Byte,Byte)]]]
case class CC_B(a: CC_A, b: T_A[CC_A, CC_A]) extends T_A[T_A[T_A[(Int,Char), Int], T_A[Boolean, Char]], T_A[(Int,Byte), T_A[Boolean, (Byte,Byte)]]]
case class CC_C() extends T_A[T_A[T_A[(Int,Char), Int], T_A[Boolean, Char]], T_A[(Int,Byte), T_A[Boolean, (Byte,Byte)]]]

val v_a: T_A[T_A[T_A[(Int,Char), Int], T_A[Boolean, Char]], T_A[(Int,Byte), T_A[Boolean, (Byte,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
  case CC_C() => 2 
}
}