package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: ((Char,Char),T_A[Byte]), b: T_A[T_A[Int]], c: (T_A[Boolean],T_A[Byte])) extends T_A[T_A[T_A[Byte]]]
case class CC_B() extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: T_A[((Char,Boolean),(Int,Int))], b: Int) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, _)