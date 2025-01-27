package Program_16 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[(T_A[Int],(Boolean,Byte))]
case class CC_B(a: T_A[T_A[CC_A]], b: T_A[CC_A], c: CC_A) extends T_A[(T_A[Int],(Boolean,Byte))]
case class CC_C(a: Char) extends T_A[(T_A[Int],(Boolean,Byte))]

val v_a: T_A[(T_A[Int],(Boolean,Byte))] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_A()) => 1 
  case CC_C(_) => 2 
}
}