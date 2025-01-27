package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: Int) extends T_A[(T_A[(Boolean,Byte), Byte],Int), E]
case class CC_B[F](a: (T_A[Char, Int],Int), b: F, c: CC_A[CC_A[F]]) extends T_A[(T_A[(Boolean,Byte), Byte],Int), F]
case class CC_C(a: CC_A[T_B[Byte, Boolean]]) extends T_A[(T_A[(Boolean,Byte), Byte],Int), (Boolean,CC_A[Int])]

val v_a: T_A[(T_A[(Boolean,Byte), Byte],Int), T_A[(T_A[(Boolean,Byte), Byte],Int), (Boolean,CC_A[Int])]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B((_,12), CC_A(_, _), CC_A(_, _)) => 1 
  case CC_B((_,_), CC_A(_, _), CC_A(_, _)) => 2 
  case CC_B((_,12), CC_B((_,_), _, CC_A(_, _)), CC_A(_, _)) => 3 
  case CC_B((_,_), CC_B((_,_), _, CC_A(_, _)), CC_A(_, _)) => 4 
  case CC_B((_,12), CC_C(CC_A(_, _)), CC_A(_, _)) => 5 
}
}
// This is not matched: CC_B((_,_), CC_C(CC_A(_, _)), CC_A(_, _))