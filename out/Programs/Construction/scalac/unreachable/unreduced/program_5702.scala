package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Int], b: T_B) extends T_A[T_A[T_A[(Boolean,Char)]]]
case class CC_B() extends T_A[T_A[T_A[(Boolean,Char)]]]
case class CC_C(a: Byte) extends T_A[T_A[T_A[(Boolean,Char)]]]
case class CC_D(a: (CC_A,Int), b: Boolean, c: Char) extends T_B
case class CC_E(a: CC_B, b: CC_B) extends T_B

val v_a: T_A[T_A[T_A[(Boolean,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D((_,_), _, _)) => 0 
  case CC_A(_, CC_E(CC_B(), _)) => 1 
  case CC_B() => 2 
  case CC_C(_) => 3 
}
}