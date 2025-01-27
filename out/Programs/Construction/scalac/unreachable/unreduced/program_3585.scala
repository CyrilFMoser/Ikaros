package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Byte, Boolean], T_A[(Boolean,Byte), Char]], b: T_A[(Byte,Char), T_A[Boolean, Int]], c: T_A[T_A[Int, Int], T_A[Int, Byte]]) extends T_A[T_A[Char, T_A[Byte, Int]], (T_A[Boolean, Boolean],T_A[Int, Boolean])]
case class CC_B() extends T_A[T_A[Char, T_A[Byte, Int]], (T_A[Boolean, Boolean],T_A[Int, Boolean])]
case class CC_C(a: CC_A, b: (T_A[CC_B, CC_A],Byte)) extends T_A[T_A[Char, T_A[Byte, Int]], (T_A[Boolean, Boolean],T_A[Int, Boolean])]

val v_a: T_A[T_A[Char, T_A[Byte, Int]], (T_A[Boolean, Boolean],T_A[Int, Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_, _, _), (_,_)) => 2 
}
}