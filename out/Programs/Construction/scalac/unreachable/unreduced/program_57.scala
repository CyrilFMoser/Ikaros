package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[(Char,Int)]], b: T_A[T_A[Int]], c: T_A[T_A[Char]]) extends T_A[(T_A[Char],((Boolean,Int),Byte))]
case class CC_B() extends T_A[(T_A[Char],((Boolean,Int),Byte))]

val v_a: T_A[(T_A[Char],((Boolean,Int),Byte))] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}