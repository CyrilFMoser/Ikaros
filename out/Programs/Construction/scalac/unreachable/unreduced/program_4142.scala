package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Char, b: T_A[T_A[Char, Char], Byte], c: (T_A[Char, Boolean],T_A[Char, Byte])) extends T_A[T_A[T_A[Int, Byte], T_A[Boolean, Boolean]], T_A[T_A[Char, Boolean], T_A[(Int,Int), Byte]]]
case class CC_B() extends T_A[T_A[T_A[Int, Byte], T_A[Boolean, Boolean]], T_A[T_A[Char, Boolean], T_A[(Int,Int), Byte]]]
case class CC_C(a: ((CC_B,Boolean),Int), b: T_A[T_A[Boolean, CC_B], T_A[CC_B, (Boolean,Int)]]) extends T_A[T_A[T_A[Int, Byte], T_A[Boolean, Boolean]], T_A[T_A[Char, Boolean], T_A[(Int,Int), Byte]]]

val v_a: T_A[T_A[T_A[Int, Byte], T_A[Boolean, Boolean]], T_A[T_A[Char, Boolean], T_A[(Int,Int), Byte]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(((_,_),_), _) => 1 
}
}
// This is not matched: CC_A(_, _, _)