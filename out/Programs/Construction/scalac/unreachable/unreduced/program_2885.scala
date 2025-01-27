package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: (T_A[Char, (Byte,Char)],T_A[Char, Boolean])) extends T_A[T_B[T_A[(Char,Boolean), Char], T_A[Int, Char]], T_B[T_B[(Boolean,Char), Byte], T_B[Boolean, Int]]]
case class CC_B() extends T_A[T_B[T_A[(Char,Boolean), Char], T_A[Int, Char]], T_B[T_B[(Boolean,Char), Byte], T_B[Boolean, Int]]]

val v_a: T_A[T_B[T_A[(Char,Boolean), Char], T_A[Int, Char]], T_B[T_B[(Boolean,Char), Byte], T_B[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B() => 1 
}
}