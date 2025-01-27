package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[(Int,Char), T_A[Char]]]
case class CC_B(a: (((Boolean,Boolean),CC_A),T_B[CC_A, CC_A])) extends T_A[T_B[(Int,Char), T_A[Char]]]
case class CC_C() extends T_B[Byte, (T_A[CC_B],T_A[CC_A])]
case class CC_D(a: T_A[(CC_B,(Char,Boolean))], b: Int, c: CC_B) extends T_B[Byte, (T_A[CC_B],T_A[CC_A])]

val v_a: T_B[Byte, (T_A[CC_B],T_A[CC_A])] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _, CC_B((_,_))) => 1 
}
}