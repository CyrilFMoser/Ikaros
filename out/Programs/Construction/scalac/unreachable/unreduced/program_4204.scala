package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Int]], b: (T_A[Byte],T_A[Char])) extends T_A[T_B[Int]]
case class CC_B() extends T_A[T_B[Int]]

val v_a: T_A[T_B[Int]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), (_,_)), (_,_)) => 0 
  case CC_A(CC_A(CC_B(), (_,_)), (_,_)) => 1 
  case CC_A(CC_B(), (_,_)) => 2 
  case CC_B() => 3 
}
}