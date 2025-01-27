package Program_25 

object Test {
sealed trait T_A[A]
case class CC_A(a: Boolean) extends T_A[(T_A[Int],T_A[Byte])]
case class CC_B(a: T_A[(CC_A,CC_A)], b: T_A[CC_A], c: T_A[T_A[CC_A]]) extends T_A[(T_A[Int],T_A[Byte])]
case class CC_C(a: T_A[T_A[(Byte,Boolean)]], b: (CC_A,CC_B)) extends T_A[(T_A[Int],T_A[Byte])]

val v_a: T_A[(T_A[Int],T_A[Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, (CC_A(_),CC_B(_, _, _))) => 2 
}
}