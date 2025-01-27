package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[(T_A[Int],T_A[Char])]
case class CC_B(a: CC_A, b: CC_A, c: (T_A[CC_A],T_A[Byte])) extends T_A[T_A[T_A[CC_A]]]
case class CC_C(a: T_A[CC_A], b: (CC_B,T_A[CC_A]), c: CC_A) extends T_A[(T_A[Int],T_A[Char])]

val v_a: T_A[(T_A[Int],T_A[Char])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, (CC_B(_, _, _),_), CC_A()) => 1 
}
}