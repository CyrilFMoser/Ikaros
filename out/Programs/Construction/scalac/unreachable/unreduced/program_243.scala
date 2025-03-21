package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], (T_A,T_A)], b: (T_A,Byte), c: (T_A,Byte)) extends T_A
case class CC_B(a: T_B[T_A, Char], b: Int, c: T_A) extends T_A
case class CC_C[C](a: Byte, b: Boolean, c: C) extends T_A
case class CC_D(a: T_B[T_B[CC_A, T_A], CC_C[CC_A]], b: (CC_A,CC_A), c: Char) extends T_B[T_A, CC_C[(CC_A,T_A)]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), (_,_)) => 0 
  case CC_B(_, _, CC_A(_, _, _)) => 1 
  case CC_B(_, _, CC_B(_, _, _)) => 2 
  case CC_C(_, _, _) => 3 
}
}
// This is not matched: CC_B(_, _, CC_C(_, _, _))