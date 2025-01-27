package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, Byte], T_A[Boolean, Int]], b: (T_A[Int, Char],(Int,Int)), c: (T_A[Byte, (Byte,Byte)],T_A[Boolean, Byte])) extends T_A[(T_A[Char, Byte],T_A[Char, (Byte,Byte)]), T_A[T_A[Byte, Boolean], Boolean]]
case class CC_B() extends T_A[(T_A[Char, Byte],T_A[Char, (Byte,Byte)]), T_A[T_A[Byte, Boolean], Boolean]]
case class CC_C() extends T_A[(T_A[Char, Byte],T_A[Char, (Byte,Byte)]), T_A[T_A[Byte, Boolean], Boolean]]

val v_a: T_A[(T_A[Char, Byte],T_A[Char, (Byte,Byte)]), T_A[T_A[Byte, Boolean], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C()