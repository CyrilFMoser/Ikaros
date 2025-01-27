package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: (Char,T_A[Int, Int]), c: T_A[C, C]) extends T_A[T_A[T_A[(Byte,Char), Char], T_A[Boolean, Byte]], C]
case class CC_B[D]() extends T_A[T_A[T_A[(Byte,Char), Char], T_A[Boolean, Byte]], D]

val v_a: T_A[T_A[T_A[(Byte,Char), Char], T_A[Boolean, Byte]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, ('x',_), _) => 0 
  case CC_A(_, (_,_), _) => 1 
  case CC_B() => 2 
}
}