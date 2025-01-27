package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]]) extends T_A[(T_A[Boolean],Int)]
case class CC_B(a: ((Boolean,CC_A),Byte)) extends T_A[(T_A[Boolean],Int)]
case class CC_C(a: T_A[CC_A]) extends T_A[(T_A[Boolean],Int)]

val v_a: T_A[(T_A[Boolean],Int)] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(((_,_),_)) => 1 
  case CC_C(_) => 2 
}
}