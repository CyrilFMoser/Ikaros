package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_B[Byte]], b: T_B[T_B[Int]]) extends T_A[(Byte,T_B[Char]), (T_B[Byte],T_A[(Boolean,Boolean), Char])]
case class CC_B(a: Byte, b: (T_B[CC_A],Byte), c: Char) extends T_A[(Byte,T_B[Char]), (T_B[Byte],T_A[(Boolean,Boolean), Char])]
case class CC_C(a: CC_B, b: CC_A) extends T_A[(Byte,T_B[Char]), (T_B[Byte],T_A[(Boolean,Boolean), Char])]
case class CC_D(a: CC_A) extends T_B[((CC_A,CC_C),T_B[Int])]

val v_a: T_A[(Byte,T_B[Char]), (T_B[Byte],T_A[(Boolean,Boolean), Char])] = null
val v_b: Int = v_a match{
  case CC_B(_, (_,_), _) => 0 
  case CC_C(CC_B(_, _, _), _) => 1 
}
}
// This is not matched: CC_A(_, _)