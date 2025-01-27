package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_A[Char, Char]]) extends T_A[T_A[T_A[Int, Char], (Int,Char)], ((Byte,Boolean),T_A[Boolean, Byte])]
case class CC_B(a: Byte, b: (T_A[CC_A, Boolean],(CC_A,Int))) extends T_A[T_A[T_A[Int, Char], (Int,Char)], ((Byte,Boolean),T_A[Boolean, Byte])]
case class CC_C(a: Byte, b: CC_A) extends T_A[T_A[T_A[Int, Char], (Int,Char)], ((Byte,Boolean),T_A[Boolean, Byte])]

val v_a: T_A[T_A[T_A[Int, Char], (Int,Char)], ((Byte,Boolean),T_A[Boolean, Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(0, (_,_)) => 1 
  case CC_B(_, (_,_)) => 2 
}
}
// This is not matched: CC_C(_, CC_A(_))