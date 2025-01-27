package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, (Char,Char)], (T_A,T_A)], b: T_A, c: (T_A,T_B[T_A, T_A])) extends T_A
case class CC_B(a: T_A, b: T_A) extends T_A
case class CC_C[C](a: CC_B, b: T_A) extends T_B[C, (T_A,Char)]
case class CC_D(a: (CC_C[T_A],T_A)) extends T_B[Int, (T_A,Char)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), (_,_)) => 0 
  case CC_A(_, CC_B(_, _), (_,_)) => 1 
  case CC_B(_, _) => 2 
}
}