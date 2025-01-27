package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[(Int,Char), T_A[Char, Char]], b: T_A[Byte, T_A[Boolean, Int]], c: (T_A[Int, Boolean],T_A[Boolean, Boolean])) extends T_A[Char, T_A[T_A[Byte, Boolean], T_A[Char, (Boolean,Byte)]]]
case class CC_B() extends T_A[Char, T_A[T_A[Byte, Boolean], T_A[Char, (Boolean,Byte)]]]
case class CC_C() extends T_A[Char, T_A[T_A[Byte, Boolean], T_A[Char, (Boolean,Byte)]]]

val v_a: T_A[Char, T_A[T_A[Byte, Boolean], T_A[Char, (Boolean,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}