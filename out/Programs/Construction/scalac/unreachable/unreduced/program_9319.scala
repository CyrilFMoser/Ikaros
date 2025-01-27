package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: Byte) extends T_A[C, (T_A[Char, (Char,Char)],(Int,(Int,Boolean)))]
case class CC_B() extends T_A[Int, (T_A[Char, (Char,Char)],(Int,(Int,Boolean)))]

val v_a: T_A[Int, (T_A[Char, (Char,Char)],(Int,(Int,Boolean)))] = null
val v_b: Int = v_a match{
  case CC_A(_, 12, 0) => 0 
  case CC_A(_, _, 0) => 1 
  case CC_A(_, 12, _) => 2 
  case CC_A(_, _, _) => 3 
  case CC_B() => 4 
}
}