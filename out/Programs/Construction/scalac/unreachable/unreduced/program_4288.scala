package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[(Char,Char), Boolean], T_A[Int, Int]], b: (T_A[Int, Int],T_A[Int, Char])) extends T_A[T_A[T_A[(Byte,Int), Byte], Char], T_A[T_A[Boolean, Boolean], T_A[Byte, Byte]]]
case class CC_B() extends T_A[T_A[T_A[(Byte,Int), Byte], Char], T_A[T_A[Boolean, Boolean], T_A[Byte, Byte]]]

val v_a: T_A[T_A[T_A[(Byte,Int), Byte], Char], T_A[T_A[Boolean, Boolean], T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}