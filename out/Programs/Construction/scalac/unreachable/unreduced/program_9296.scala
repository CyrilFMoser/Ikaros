package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: T_A[(Boolean,Boolean)], c: (T_A[Int],T_A[Char])) extends T_A[(T_A[(Boolean,Byte)],Char)]
case class CC_B(a: Char, b: CC_A) extends T_A[(T_A[(Boolean,Byte)],Char)]

val v_a: T_A[(T_A[(Boolean,Byte)],Char)] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}