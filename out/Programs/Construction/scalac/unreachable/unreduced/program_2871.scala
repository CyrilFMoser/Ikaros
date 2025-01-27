package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, Char], T_A[Int, Boolean]]) extends T_A[T_A[T_A[(Boolean,Char), (Boolean,Byte)], T_A[Int, (Int,Boolean)]], (T_A[Int, Boolean],T_A[Int, Byte])]
case class CC_B() extends T_A[T_A[T_A[(Boolean,Char), (Boolean,Byte)], T_A[Int, (Int,Boolean)]], (T_A[Int, Boolean],T_A[Int, Byte])]

val v_a: T_A[T_A[T_A[(Boolean,Char), (Boolean,Byte)], T_A[Int, (Int,Boolean)]], (T_A[Int, Boolean],T_A[Int, Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}