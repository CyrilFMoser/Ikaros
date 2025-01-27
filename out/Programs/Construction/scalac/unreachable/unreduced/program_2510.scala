package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, Boolean], T_A[Boolean, Byte]]) extends T_A[Boolean, T_A[T_A[Int, Boolean], T_A[Char, Char]]]
case class CC_B(a: ((CC_A,Boolean),Byte)) extends T_A[Boolean, T_A[T_A[Int, Boolean], T_A[Char, Char]]]

val v_a: T_A[Boolean, T_A[T_A[Int, Boolean], T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(((_,_),0)) => 1 
  case CC_B(((_,_),_)) => 2 
}
}